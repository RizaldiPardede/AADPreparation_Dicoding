package com.dicoding.courseschedule.ui.add

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageButton
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.dicoding.courseschedule.R
import com.dicoding.courseschedule.util.TimePickerFragment
import java.text.SimpleDateFormat
import java.util.*

class AddCourseActivity : AppCompatActivity(), TimePickerFragment.DialogTimeListener {

    private lateinit var edCourseName: TextView
    private lateinit var edDay: Spinner
    private lateinit var edLecturer: TextView
    private lateinit var edNote: TextView
    private lateinit var btnStart: ImageButton
    private lateinit var btnEnd: ImageButton
    private lateinit var tvStart: TextView
    private lateinit var tvEnd: TextView

    private lateinit var viewModel: AddCourseViewModel

    private var timeStart: String? = null
    private var timeEnd: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_addcourse)

        supportActionBar?.title = getString(R.string.add_course)

        val factory = AddCourseFactory.createFactory(this)
        viewModel = ViewModelProvider(this, factory).get(AddCourseViewModel::class.java)

        init()

        btnStart.setOnClickListener {
            showDatePicker(TAG_START)
        }

        btnEnd.setOnClickListener {
            showDatePicker(TAG_END)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_add, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_insert -> {
                if (edCourseName.text.toString()
                        .isEmpty() || timeStart.isNullOrEmpty() || timeEnd.isNullOrEmpty()
                ) {
                    Toast.makeText(
                        this,
                        getString(R.string.input_empty_message),
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
                    viewModel.insertCourse(
                        edCourseName.text.toString(),
                        edDay.selectedItemPosition,
                        timeStart!!,
                        timeEnd!!,
                        edLecturer.text.toString(),
                        edNote.text.toString()
                    )
                    Toast.makeText(this, "Insert data successful", Toast.LENGTH_SHORT).show()
                    onBackPressed()
                }
                true
            }
            else -> super.onOptionsItemSelected(item)
        }

    }

    private fun showDatePicker(tag: String) {
        val timePickerFragment = TimePickerFragment()
        timePickerFragment.show(supportFragmentManager, tag)
    }

    private fun init() {
        edCourseName = findViewById(R.id.add_ed_course_name)
        edDay = findViewById(R.id.spinner_day)
        edLecturer = findViewById(R.id.ed_lecturer)
        edNote = findViewById(R.id.ed_note)
        btnStart = findViewById(R.id.ib_start_time)
        btnEnd = findViewById(R.id.ib_end_time)
        tvStart = findViewById(R.id.add_tv_start)
        tvEnd = findViewById(R.id.add_tv_end)
    }

    override fun onDialogTimeSet(tag: String?, hour: Int, minute: Int) {
        val timePicker = Calendar.getInstance()
        timePicker.set(Calendar.HOUR_OF_DAY, hour)
        timePicker.set(Calendar.MINUTE, minute)

        val timeFormat = SimpleDateFormat("HH:mm", Locale.getDefault())
        if (tag == TAG_START) {
            tvStart.text = timeFormat.format(timePicker.time)
            timeStart = tvStart.text.toString()
        } else {
            tvEnd.text = timeFormat.format(timePicker.time)
            timeEnd = tvEnd.text.toString()
        }
    }

    companion object {
        const val TAG_START = "start"
        const val TAG_END = "end"
    }
}