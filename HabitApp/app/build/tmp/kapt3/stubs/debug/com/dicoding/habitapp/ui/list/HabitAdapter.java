package com.dicoding.habitapp.ui.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00102\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0010\u0011B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00062\n\u0010\t\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/dicoding/habitapp/ui/list/HabitAdapter;", "Landroidx/paging/PagedListAdapter;", "Lcom/dicoding/habitapp/data/Habit;", "Lcom/dicoding/habitapp/ui/list/HabitAdapter$HabitViewHolder;", "onClick", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "HabitViewHolder", "app_debug"})
public final class HabitAdapter extends androidx.paging.PagedListAdapter<com.dicoding.habitapp.data.Habit, com.dicoding.habitapp.ui.list.HabitAdapter.HabitViewHolder> {
    private final kotlin.jvm.functions.Function1<com.dicoding.habitapp.data.Habit, kotlin.Unit> onClick = null;
    @org.jetbrains.annotations.NotNull
    public static final com.dicoding.habitapp.ui.list.HabitAdapter.Companion Companion = null;
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.dicoding.habitapp.data.Habit> DIFF_CALLBACK = null;
    
    public HabitAdapter(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.dicoding.habitapp.data.Habit, kotlin.Unit> onClick) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.dicoding.habitapp.ui.list.HabitAdapter.HabitViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.dicoding.habitapp.ui.list.HabitAdapter.HabitViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0006R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/dicoding/habitapp/ui/list/HabitAdapter$HabitViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/dicoding/habitapp/ui/list/HabitAdapter;Landroid/view/View;)V", "getHabit", "Lcom/dicoding/habitapp/data/Habit;", "getGetHabit", "()Lcom/dicoding/habitapp/data/Habit;", "setGetHabit", "(Lcom/dicoding/habitapp/data/Habit;)V", "ivPriority", "Landroid/widget/ImageView;", "tvMinutes", "Landroid/widget/TextView;", "tvStartTime", "tvTitle", "bind", "", "habit", "app_debug"})
    public final class HabitViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.TextView tvTitle = null;
        private final android.widget.ImageView ivPriority = null;
        private final android.widget.TextView tvStartTime = null;
        private final android.widget.TextView tvMinutes = null;
        public com.dicoding.habitapp.data.Habit getHabit;
        
        public HabitViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.dicoding.habitapp.data.Habit getGetHabit() {
            return null;
        }
        
        public final void setGetHabit(@org.jetbrains.annotations.NotNull
        com.dicoding.habitapp.data.Habit p0) {
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.dicoding.habitapp.data.Habit habit) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/dicoding/habitapp/ui/list/HabitAdapter$Companion;", "", "()V", "DIFF_CALLBACK", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/dicoding/habitapp/data/Habit;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}