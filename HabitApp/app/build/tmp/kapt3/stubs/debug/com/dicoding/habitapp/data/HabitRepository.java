package com.dicoding.habitapp.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u0006\u0010\r\u001a\u00020\u000eJ\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00100\f2\u0006\u0010\u0011\u001a\u00020\u0012J\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/dicoding/habitapp/data/HabitRepository;", "", "habitDao", "Lcom/dicoding/habitapp/data/HabitDao;", "executor", "Ljava/util/concurrent/ExecutorService;", "(Lcom/dicoding/habitapp/data/HabitDao;Ljava/util/concurrent/ExecutorService;)V", "deleteHabit", "", "habit", "Lcom/dicoding/habitapp/data/Habit;", "getHabitById", "Landroidx/lifecycle/LiveData;", "habitId", "", "getHabits", "Landroidx/paging/PagedList;", "filter", "Lcom/dicoding/habitapp/utils/HabitSortType;", "getRandomHabitByPriorityLevel", "level", "", "insertHabit", "", "newHabit", "Companion", "app_debug"})
public final class HabitRepository {
    private final com.dicoding.habitapp.data.HabitDao habitDao = null;
    private final java.util.concurrent.ExecutorService executor = null;
    @org.jetbrains.annotations.NotNull
    public static final com.dicoding.habitapp.data.HabitRepository.Companion Companion = null;
    public static final int PAGE_SIZE = 30;
    public static final boolean PLACEHOLDER = true;
    @kotlin.jvm.Volatile
    private static volatile com.dicoding.habitapp.data.HabitRepository instance;
    
    public HabitRepository(@org.jetbrains.annotations.NotNull
    com.dicoding.habitapp.data.HabitDao habitDao, @org.jetbrains.annotations.NotNull
    java.util.concurrent.ExecutorService executor) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<androidx.paging.PagedList<com.dicoding.habitapp.data.Habit>> getHabits(@org.jetbrains.annotations.NotNull
    com.dicoding.habitapp.utils.HabitSortType filter) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.dicoding.habitapp.data.Habit> getHabitById(int habitId) {
        return null;
    }
    
    public final long insertHabit(@org.jetbrains.annotations.NotNull
    com.dicoding.habitapp.data.Habit newHabit) {
        return 0L;
    }
    
    public final void deleteHabit(@org.jetbrains.annotations.NotNull
    com.dicoding.habitapp.data.Habit habit) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.dicoding.habitapp.data.Habit> getRandomHabitByPriorityLevel(@org.jetbrains.annotations.NotNull
    java.lang.String level) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/dicoding/habitapp/data/HabitRepository$Companion;", "", "()V", "PAGE_SIZE", "", "PLACEHOLDER", "", "instance", "Lcom/dicoding/habitapp/data/HabitRepository;", "getInstance", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.dicoding.habitapp.data.HabitRepository getInstance(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
    }
}