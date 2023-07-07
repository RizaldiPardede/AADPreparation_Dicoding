package com.dicoding.habitapp.data;

import java.lang.System;

@androidx.room.Database(entities = {com.dicoding.habitapp.data.Habit.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/dicoding/habitapp/data/HabitDatabase;", "Landroidx/room/RoomDatabase;", "()V", "habitDao", "Lcom/dicoding/habitapp/data/HabitDao;", "Companion", "app_debug"})
public abstract class HabitDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull
    public static final com.dicoding.habitapp.data.HabitDatabase.Companion Companion = null;
    @kotlin.jvm.Volatile
    private static volatile com.dicoding.habitapp.data.HabitDatabase INSTANCE;
    
    public HabitDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.dicoding.habitapp.data.HabitDao habitDao();
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/dicoding/habitapp/data/HabitDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/dicoding/habitapp/data/HabitDatabase;", "fillWithStartingData", "", "context", "Landroid/content/Context;", "dao", "Lcom/dicoding/habitapp/data/HabitDao;", "getInstance", "loadJsonArray", "Lorg/json/JSONArray;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.dicoding.habitapp.data.HabitDatabase getInstance(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
        
        private final void fillWithStartingData(android.content.Context context, com.dicoding.habitapp.data.HabitDao dao) {
        }
        
        private final org.json.JSONArray loadJsonArray(android.content.Context context) {
            return null;
        }
    }
}