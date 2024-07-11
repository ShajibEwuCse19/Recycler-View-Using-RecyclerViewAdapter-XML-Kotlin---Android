package com.example.recyclerviewpractice01

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewpractice01.databinding.RecyclerViewItemBinding

/**
 * @author Shajib
 * @since Jul 11, 2024
 **/
class PersonInformationAdapter(
    private val personInformation: ArrayList<Pair<String, String>>
) : RecyclerView.Adapter<PersonInformationAdapter.PersonInformationViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonInformationViewHolder {
        return PersonInformationViewHolder(
            //LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_item, parent, false)

            RecyclerViewItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: PersonInformationViewHolder, position: Int) {
        holder.setData(personInformation[position])
    }

    override fun getItemCount(): Int {
        return personInformation.size
    }


    inner class PersonInformationViewHolder(private val binding: RecyclerViewItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        internal fun setData(personInformation: Pair<String, String>) {
            binding.textViewName.text = personInformation.first
            binding.textViewAddress.text = personInformation.second
        }
    }
}