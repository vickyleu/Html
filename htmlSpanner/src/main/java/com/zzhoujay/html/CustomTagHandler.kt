package com.zzhoujay.html

import android.text.SpannableStringBuilder
import org.xml.sax.Attributes

interface CustomTagHandler {
    fun handleTag(
        opening: Boolean,
        tag: String,
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