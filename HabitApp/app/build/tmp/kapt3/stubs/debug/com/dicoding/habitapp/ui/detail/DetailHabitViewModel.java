package com.dicoding.habitapp.ui.detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0015\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u0011R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/dicoding/habitapp/ui/detail/DetailHabitViewModel;", "Landroidx/lifecycle/ViewModel;", "habitRepository", "Lcom/dicoding/habitapp/data/HabitRepository;", "(Lcom/dicoding/habitapp/data/HabitRepository;)V", "_habit", "Landroidx/lifecycle/LiveData;", "Lcom/dicoding/habitapp/data/Habit;", "_habitId", "Landroidx/lifecycle/MutableLiveData;", "", "habit", "getHabit", "()Landroidx/lifecycle/LiveData;", "start", "", "habitId", "(Ljava/lang/Integer;)V", "app_debug"})
public final class DetailHabitViewModel extends androidx.lifecycle.ViewModel {
    private final com.dicoding.habitapp.data.HabitRepository habitRepository = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _habitId = null;
    private final androidx.lifecycle.LiveData<com.dicoding.habitapp.data.Habit> _habit = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.dicoding.habitapp.data.Habit> habit = null;
    
    public DetailHabitViewModel(@org.jetbrains.annotations.NotNull
    com.dicoding.habitapp.data.HabitRepository habitRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.dicoding.habitapp.data.Habit> getHabit() {
        return null;
    }
    
    public final void start(@org.jetbrains.annotations.Nullable
    java.lang.Integer habitId) {
    }
}