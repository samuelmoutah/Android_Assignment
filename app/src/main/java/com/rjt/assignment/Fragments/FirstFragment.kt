package com.rjt.assignment.Fragments

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rjt.assignment.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.android.synthetic.main.fragment_first.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [FirstFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [FirstFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FirstFragment : Fragment() {

    private var listener: OnFragmentInteractionListener? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_first, container, false)

        view.button_submit.setOnClickListener {
            var firstName = edit_text_first.text.toString()
            var lastName = edit_text_last.text.toString()
            var address = edit_text_address.text.toString()
            var state = edit_text_state.text.toString()
            var zip = edit_text_zip.text.toString()
            var age = edit_text_age.text.toString()
            var gender = edit_text_gender.text.toString()
            var phone = edit_text_phone.text.toString()
            var email = edit_text_email.text.toString()
            var hobby = edit_text_hobby.text.toString()

            listener?.onFragmentInteraction_first(firstName)
            listener?.onFragmentInteraction_last(lastName)
            listener?.onFragmentInteraction_address(address)
            listener?.onFragmentInteraction_state(state)
            listener?.onFragmentInteraction_zip(zip)
            listener?.onFragmentInteraction_age(age)
            listener?.onFragmentInteraction_gender(gender)
            listener?.onFragmentInteraction_phone(phone)
            listener?.onFragmentInteraction_email(email)
            listener?.onFragmentInteraction_hobby(hobby)
        }

        return view
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnFragmentInteractionListener) {
            listener = context
        } else {
            throw RuntimeException(context.toString() + " must implement OnFragmentInteractionListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }


    interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        fun onFragmentInteraction_first(first: String)

        fun onFragmentInteraction_last(last: String)

        fun onFragmentInteraction_address(address: String)

        fun onFragmentInteraction_state(state: String)

        fun onFragmentInteraction_zip(zip: String)

        fun onFragmentInteraction_age(age: String)

        fun onFragmentInteraction_gender(gender: String)

        fun onFragmentInteraction_phone(phone: String)

        fun onFragmentInteraction_email(email: String)

        fun onFragmentInteraction_hobby(hobby: String)
    }


}
