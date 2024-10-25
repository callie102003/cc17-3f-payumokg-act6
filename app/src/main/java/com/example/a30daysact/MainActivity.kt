package com.example.a30daysact

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Sample data for 30 tips
        val tips = listOf(
            Tip(1, "Take a Mindful Walk", R.drawable.walk_image, "Spend 10 minutes walking mindfully today."),
            Tip(2, "Hydrate", R.drawable.water_image, "Drink at least 8 glasses of water."),
            Tip(3, "Eat a Healthy Breakfast", R.drawable.breakfast_image, "Start your day with a nutritious meal."),
            Tip(4, "Practice Gratitude", R.drawable.gratitude_image, "List three things you are grateful for."),
            Tip(5, "Do Some Stretching", R.drawable.stretch_image, "Stretch for at least 5 minutes."),
            Tip(6, "Connect with Nature", R.drawable.nature_image, "Spend some time outdoors today."),
            Tip(7, "Read a Book", R.drawable.book_image, "Read a few pages of a book you enjoy."),
            Tip(8, "Try Deep Breathing", R.drawable.breathing_image, "Take deep breaths for 5 minutes."),
            Tip(9, "Limit Screen Time", R.drawable.screen_image, "Spend less time on screens today."),
            Tip(10, "Meditate", R.drawable.meditate_image, "Take 10 minutes to meditate and relax."),
            Tip(11, "Declutter", R.drawable.declutter_image, "Organize a small space in your home."),
            Tip(12, "Do a Creative Activity", R.drawable.creative_image, "Engage in a creative hobby."),
            Tip(13, "Exercise", R.drawable.exercise_image, "Spend at least 20 minutes on physical activity."),
            Tip(14, "Journal", R.drawable.journal_image, "Write down your thoughts and feelings."),
            Tip(15, "Try a New Recipe", R.drawable.cooking_image, "Cook or bake something new today."),
            Tip(16, "Practice Positive Affirmations", R.drawable.affirmation_image, "Say three positive affirmations."),
            Tip(17, "Listen to Relaxing Music", R.drawable.music_image, "Take time to relax with soothing music."),
            Tip(18, "Limit Caffeine", R.drawable.coffee_image, "Reduce your caffeine intake today."),
            Tip(19, "Plan Your Day", R.drawable.plan_image, "Organize your tasks for the day."),
            Tip(20, "Spend Quality Time with Loved Ones", R.drawable.family_image, "Connect with friends or family."),
            Tip(21, "Go to Bed Early", R.drawable.sleep_image, "Try to get a good night's sleep."),
            Tip(22, "Express Kindness", R.drawable.kindness_image, "Do something kind for someone else."),
            Tip(23, "Try Yoga", R.drawable.yoga_image, "Spend 10 minutes doing yoga."),
            Tip(24, "Drink Herbal Tea", R.drawable.tea_image, "Enjoy a cup of herbal tea."),
            Tip(25, "Unplug", R.drawable.unplug_image, "Take a break from technology."),
            Tip(26, "Visualize Your Goals", R.drawable.visualize_image, "Spend time visualizing your goals."),
            Tip(27, "Practice Good Posture", R.drawable.posture_image, "Be mindful of your posture today."),
            Tip(28, "Have a Fruit", R.drawable.fruit_image, "Include fresh fruit in your diet."),
            Tip(29, "Do Something Fun", R.drawable.fun_image, "Engage in an activity you enjoy."),
            Tip(30, "Reflect on the Month", R.drawable.reflect_image, "Take time to reflect on the past 30 days.")
        )

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = TipAdapter(tips)
    }
}
