package com.example.week8.adaptor

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.week8.model.crazy
import com.example.week8.databinding.CrazyBinding

class adaptor (var barang :List<crazy>) : RecyclerView.Adapter<adaptor.TodoViewHolder>() {
    inner class TodoViewHolder(val binding: CrazyBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        return TodoViewHolder(
            CrazyBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )


    }

    override fun getItemCount(): Int {
        return barang.size
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        holder.binding.apply {
            imgView.setImageResource(barang[position].img)
            tvView.text = barang[position].tv
            tv2View.text = barang[position].tv2
        }
    }
}