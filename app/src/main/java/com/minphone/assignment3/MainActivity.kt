package com.minphone.assignment3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.core.view.setPadding
import com.minphone.assignment3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
      override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            val binding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.root)

            binding.btnAdd.setOnClickListener {
                  if (binding.etVersionName.text.isEmpty()) {
                        binding.etVersionName.error = "Please enter a Android Version"
                        return@setOnClickListener
                  }

                  if (binding.etCodeName.text.isEmpty()) {
                        binding.etCodeName.error = "Please enter a Android code name"
                        return@setOnClickListener
                  }

                  val tableRow = TableRow(applicationContext)
                  tableRow.setPadding(18)
                  tableRow.setBackgroundColor(ContextCompat.getColor(applicationContext, R.color.pink))

                  val layoutParams = TableLayout.LayoutParams(
                        TableLayout.LayoutParams.MATCH_PARENT,
                        TableLayout.LayoutParams.WRAP_CONTENT
                  )
                  layoutParams.setMargins(0, 24, 0, 0)
                  tableRow.layoutParams = layoutParams

                  val versionTextView = TextView(applicationContext)
                  versionTextView.text = binding.etVersionName.text.toString()
                  versionTextView.textSize = 16f
                  versionTextView.gravity = Gravity.CENTER_HORIZONTAL
                  tableRow.addView(versionTextView)

                  val codeTextView = TextView(applicationContext)
                  codeTextView.text = binding.etCodeName.text.toString()
                  codeTextView.textSize = 16f
                  codeTextView.gravity = Gravity.CENTER_HORIZONTAL
                  tableRow.addView(codeTextView)

                  binding.blAndroidSDK.addView(tableRow, layoutParams)

                  binding.etVersionName.text.clear()
                  binding.etCodeName.text.clear()
                  binding.etCodeName.clearFocus()
            }
      }
}