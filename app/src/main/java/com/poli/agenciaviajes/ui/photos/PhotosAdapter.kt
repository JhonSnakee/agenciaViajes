package com.poli.agenciaviajes.ui.photos
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.poli.agenciaviajes.databinding.ItemPhotoBinding
import com.squareup.picasso.Picasso // Asegúrate de importar Picasso

class PhotosAdapter(private val onClick: (String) -> Unit) : RecyclerView.Adapter<PhotosAdapter.PhotoViewHolder>() {
    private var data: List<Photo> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoViewHolder {
        val binding = ItemPhotoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PhotoViewHolder(binding, onClick)
    }

    override fun onBindViewHolder(holder: PhotoViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int = data.size

    fun submitList(photos: List<Photo>) {
        data = photos
        notifyDataSetChanged()
    }

    class PhotoViewHolder(private val binding: ItemPhotoBinding, private val onClick: (String) -> Unit) : RecyclerView.ViewHolder(binding.root) {
        fun bind(photo: Photo) {
            Picasso.get().load(photo.imageUrl).into(binding.imageView)
            binding.root.setOnClickListener { onClick(photo.description) }
        }
    }
}

