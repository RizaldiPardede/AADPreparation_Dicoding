package com.dicoding.habitapp.ui.random;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t\u00a8\u0006\u000e"}, d2 = {"Lcom/dicoding/habitapp/ui/random/RandomHabitViewModel;", "Landroidx/lifecycle/ViewModel;", "habitRepository", "Lcom/dicoding/habitapp/data/HabitRepository;", "(Lcom/dicoding/habitapp/data/HabitRepository;)V", "priorityLevelHigh", "Landroidx/lifecycle/LiveData;", "Lcom/dicoding/habitapp/data/Habit;", "getPriorityLevelHigh", "()Landroidx/lifecycle/LiveData;", "priorityLevelLow", "getPriorityLevelLow", "priorityLevelMedium", "getPriorityLevelMedium", "app_debug"})
public final class RandomHabitViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.dicoding.habitapp.data.Habit> priorityLevelHigh = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.dicoding.habitapp.data.Habit> priorityLevelMedium = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.dicoding.habitapp.data.Habit> priorityLevelLow = null;
    
    public RandomHabitViewModel(@org.jetbrains.annotations.NotNull
    com.dicoding.habitapp.data.HabitRepository habitRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.dicoding.habitapp.data.Habit> getPriorityLevelHigh() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.dicoding.habitapp.data.Habit> getPriorityLevelMedium() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.dicoding.habitapp.data.Habit> getPriorityLevelLow() {
        return null;
    }
}