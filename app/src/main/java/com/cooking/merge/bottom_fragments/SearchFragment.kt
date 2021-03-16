package com.cooking.merge.bottom_fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.cooking.merge.R
import kotlinx.android.synthetic.main.fragment_search.view.*

class  SearchFragment : Fragment(){

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View ?
         = inflater.inflate(R.layout.fragment_search, container, false)

}