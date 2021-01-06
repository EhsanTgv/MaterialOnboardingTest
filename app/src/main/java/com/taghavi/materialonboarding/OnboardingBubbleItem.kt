package com.taghavi.materialonboarding

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.view.View
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.layout_bubble_item.view.*

class OnboardingBubbleItem
@kotlin.jvm.JvmOverloads
constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : FrameLayout(context, attrs, defStyleAttr) {

    init { initView(attrs) }

    private fun initView(attrs: AttributeSet?) {
        View.inflate(context, R.layout.layout_bubble_item, this)
        val ta = context.obtainStyledAttributes(attrs, R.styleable.OnboardingBubbleItem)

        val textColor = ta.getColor(R.styleable.OnboardingBubbleItem_bl_text_color, Color.BLACK)
        val gravity = ta.getInt(R.styleable.OnboardingBubbleItem_bl_alignment, 0)

        val text = ta.getString(R.styleable.OnboardingBubbleItem_bl_text)
        bubbleItemTitle.text = text
        bubbleItemTitle.setTextColor(textColor)
        bubbleItemTitle.setTextGravity(gravity)

        val description = ta.getString(R.styleable.OnboardingBubbleItem_bl_description)
        bubbleItemDescription.text = description
        bubbleItemDescription.setTextColor(textColor)
        bubbleItemDescription.setTextGravity(gravity)
        ta.recycle()
    }

    private fun TextView.setTextGravity(value: Int) { }

    private fun ImageView.setGravity(value: Int) { }

    private fun showDetail(visibility: Int) { }
}