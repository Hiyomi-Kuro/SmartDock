package cu.axel.smartdock.models

import android.graphics.drawable.Drawable
const val WINDOWING_MODE_FULLSCREEN = 1
const val WINDOWING_MODE_FREEFORM = 5
class AppTask(val id: Int, label: String, packageName: String, icon: Drawable, val windowingMode: Int = -1) : App(label, packageName, icon)
