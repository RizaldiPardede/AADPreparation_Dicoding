package com.dicoding.habitapp.data;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\b\u001a\u00020\tH\'J\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u000b2\u0006\u0010\f\u001a\u00020\rH\'J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\'J!\u0010\u0011\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0012\"\u00020\u0005H\'\u00a2\u0006\u0002\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0005H\'\u00a8\u0006\u0017"}, d2 = {"Lcom/dicoding/habitapp/data/HabitDao;", "", "deleteHabit", "", "habits", "Lcom/dicoding/habitapp/data/Habit;", "getHabitById", "Landroidx/lifecycle/LiveData;", "habitId", "", "getHabits", "Landroidx/paging/DataSource$Factory;", "query", "Landroidx/sqlite/db/SupportSQLiteQuery;", "getRandomHabitByPriorityLevel", "level", "", "insertAll", "", "([Lcom/dicoding/habitapp/data/Habit;)V", "insertHabit", "", "habit", "app_debug"})
public abstract interface HabitDao {
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.RawQuery(observedEntities = {com.dicoding.habitapp.data.Habit.class})
    public abstract androidx.paging.DataSource.Factory<java.lang.Integer, com.dicoding.habitapp.data.Habit> getHabits(@org.jetbrains.annotations.NotNull
    androidx.sqlite.db.SupportSQLiteQuery query);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "Select * from habits where id = :habitId")
    public abstract androidx.lifecycle.LiveData<com.dicoding.habitapp.data.Habit> getHabitById(int habitId);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract long insertHabit(@org.jetbrains.annotations.NotNull
    com.dicoding.habitapp.data.Habit habit);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull
    com.dicoding.habitapp.data.Habit... habits);
    
    @androidx.room.Delete
    public abstract void deleteHabit(@org.jetbrains.annotations.NotNull
    com.dicoding.habitapp.data.Habit habits);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "Select * from habits where priorityLevel = :level ORDER BY random() LIMIT 1")
    public abstract androidx.lifecycle.LiveData<com.dicoding.habitapp.data.Habit> getRandomHabitByPriorityLevel(@org.jetbrains.annotations.NotNull
    java.lang.String level);
}