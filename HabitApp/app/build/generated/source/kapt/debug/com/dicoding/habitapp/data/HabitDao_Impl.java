package com.dicoding.habitapp.data;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.paging.DataSource;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.paging.LimitOffsetDataSource;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class HabitDao_Impl implements HabitDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Habit> __insertionAdapterOfHabit;

  private final EntityDeletionOrUpdateAdapter<Habit> __deletionAdapterOfHabit;

  public HabitDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfHabit = new EntityInsertionAdapter<Habit>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `habits` (`id`,`title`,`minutesFocus`,`startTime`,`priorityLevel`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Habit value) {
        stmt.bindLong(1, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        stmt.bindLong(3, value.getMinutesFocus());
        if (value.getStartTime() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getStartTime());
        }
        if (value.getPriorityLevel() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPriorityLevel());
        }
      }
    };
    this.__deletionAdapterOfHabit = new EntityDeletionOrUpdateAdapter<Habit>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `habits` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Habit value) {
        stmt.bindLong(1, value.getId());
      }
    };
  }

  @Override
  public long insertHabit(final Habit habit) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfHabit.insertAndReturnId(habit);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAll(final Habit... habits) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfHabit.insert(habits);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteHabit(final Habit habits) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfHabit.handle(habits);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<Habit> getHabitById(final int habitId) {
    final String _sql = "Select * from habits where id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, habitId);
    return __db.getInvalidationTracker().createLiveData(new String[]{"habits"}, false, new Callable<Habit>() {
      @Override
      public Habit call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfMinutesFocus = CursorUtil.getColumnIndexOrThrow(_cursor, "minutesFocus");
          final int _cursorIndexOfStartTime = CursorUtil.getColumnIndexOrThrow(_cursor, "startTime");
          final int _cursorIndexOfPriorityLevel = CursorUtil.getColumnIndexOrThrow(_cursor, "priorityLevel");
          final Habit _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final long _tmpMinutesFocus;
            _tmpMinutesFocus = _cursor.getLong(_cursorIndexOfMinutesFocus);
            final String _tmpStartTime;
            if (_cursor.isNull(_cursorIndexOfStartTime)) {
              _tmpStartTime = null;
            } else {
              _tmpStartTime = _cursor.getString(_cursorIndexOfStartTime);
            }
            final String _tmpPriorityLevel;
            if (_cursor.isNull(_cursorIndexOfPriorityLevel)) {
              _tmpPriorityLevel = null;
            } else {
              _tmpPriorityLevel = _cursor.getString(_cursorIndexOfPriorityLevel);
            }
            _result = new Habit(_tmpId,_tmpTitle,_tmpMinutesFocus,_tmpStartTime,_tmpPriorityLevel);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<Habit> getRandomHabitByPriorityLevel(final String level) {
    final String _sql = "Select * from habits where priorityLevel = ? ORDER BY random() LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (level == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, level);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"habits"}, false, new Callable<Habit>() {
      @Override
      public Habit call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfMinutesFocus = CursorUtil.getColumnIndexOrThrow(_cursor, "minutesFocus");
          final int _cursorIndexOfStartTime = CursorUtil.getColumnIndexOrThrow(_cursor, "startTime");
          final int _cursorIndexOfPriorityLevel = CursorUtil.getColumnIndexOrThrow(_cursor, "priorityLevel");
          final Habit _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final long _tmpMinutesFocus;
            _tmpMinutesFocus = _cursor.getLong(_cursorIndexOfMinutesFocus);
            final String _tmpStartTime;
            if (_cursor.isNull(_cursorIndexOfStartTime)) {
              _tmpStartTime = null;
            } else {
              _tmpStartTime = _cursor.getString(_cursorIndexOfStartTime);
            }
            final String _tmpPriorityLevel;
            if (_cursor.isNull(_cursorIndexOfPriorityLevel)) {
              _tmpPriorityLevel = null;
            } else {
              _tmpPriorityLevel = _cursor.getString(_cursorIndexOfPriorityLevel);
            }
            _result = new Habit(_tmpId,_tmpTitle,_tmpMinutesFocus,_tmpStartTime,_tmpPriorityLevel);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public DataSource.Factory<Integer, Habit> getHabits(final SupportSQLiteQuery query) {
    final SupportSQLiteQuery _internalQuery = query;
    return new DataSource.Factory<Integer, Habit>() {
      @Override
      public LimitOffsetDataSource<Habit> create() {
        return new LimitOffsetDataSource<Habit>(__db, _internalQuery, false, true , "habits") {
          @Override
          protected List<Habit> convertRows(Cursor cursor) {
            final List<Habit> _res = new ArrayList<Habit>(cursor.getCount());
            while(cursor.moveToNext()) {
              final Habit _item;
              _item = __entityCursorConverter_comDicodingHabitappDataHabit(cursor);
              _res.add(_item);
            }
            return _res;
          }
        };
      }
    };
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }

  private Habit __entityCursorConverter_comDicodingHabitappDataHabit(Cursor cursor) {
    final Habit _entity;
    final int _cursorIndexOfId = cursor.getColumnIndex("id");
    final int _cursorIndexOfTitle = cursor.getColumnIndex("title");
    final int _cursorIndexOfMinutesFocus = cursor.getColumnIndex("minutesFocus");
    final int _cursorIndexOfStartTime = cursor.getColumnIndex("startTime");
    final int _cursorIndexOfPriorityLevel = cursor.getColumnIndex("priorityLevel");
    final int _tmpId;
    if (_cursorIndexOfId == -1) {
      _tmpId = 0;
    } else {
      _tmpId = cursor.getInt(_cursorIndexOfId);
    }
    final String _tmpTitle;
    if (_cursorIndexOfTitle == -1) {
      _tmpTitle = null;
    } else {
      if (cursor.isNull(_cursorIndexOfTitle)) {
        _tmpTitle = null;
      } else {
        _tmpTitle = cursor.getString(_cursorIndexOfTitle);
      }
    }
    final long _tmpMinutesFocus;
    if (_cursorIndexOfMinutesFocus == -1) {
      _tmpMinutesFocus = 0;
    } else {
      _tmpMinutesFocus = cursor.getLong(_cursorIndexOfMinutesFocus);
    }
    final String _tmpStartTime;
    if (_cursorIndexOfStartTime == -1) {
      _tmpStartTime = null;
    } else {
      if (cursor.isNull(_cursorIndexOfStartTime)) {
        _tmpStartTime = null;
      } else {
        _tmpStartTime = cursor.getString(_cursorIndexOfStartTime);
      }
    }
    final String _tmpPriorityLevel;
    if (_cursorIndexOfPriorityLevel == -1) {
      _tmpPriorityLevel = null;
    } else {
      if (cursor.isNull(_cursorIndexOfPriorityLevel)) {
        _tmpPriorityLevel = null;
      } else {
        _tmpPriorityLevel = cursor.getString(_cursorIndexOfPriorityLevel);
      }
    }
    _entity = new Habit(_tmpId,_tmpTitle,_tmpMinutesFocus,_tmpStartTime,_tmpPriorityLevel);
    return _entity;
  }
}
