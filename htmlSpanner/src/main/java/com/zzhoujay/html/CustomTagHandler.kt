package com.zzhoujay.html

import android.text.Editable
import android.text.SpannableStringBuilder
import org.xml.sax.Attributes

interface CustomTagHandler {
    fun handleTag(
        opening: Boolean,
        tag: String,
        output: Editable
    ): Boolean

    fun prepereTag(
        opening: Boolean,
        tag: String,
        output: SpannableStringBuilder
    ): Boolean

    fun startTag(
        tag: String,
        attributes: Attributes?,
        ssb: SpannableStringBuilder
    ): Boolean

    fun endTag(
        tag: String,
        ssb: SpannableStringBuilder
    ): Boolean
}