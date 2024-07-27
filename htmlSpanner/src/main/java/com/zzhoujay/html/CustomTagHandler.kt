package com.zzhoujay.html

import android.text.SpannableStringBuilder
import org.xml.sax.Attributes

interface CustomTagHandler {
    fun handleTag(
        tag: String,
        attributes: Attributes?,
        mSpannableStringBuilder: SpannableStringBuilder
    ): Boolean
}