package ru.netology.nmedia1022.utils

import android.content.Context
import android.view.ContextMenu
import android.view.View
import android.view.inputmethod.InputMethodManager
import kotlinx.android.synthetic.main.card_post.view.*

object AndroidUtils {
    fun hideKeyboard(view: View){
        val imm = view.context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}