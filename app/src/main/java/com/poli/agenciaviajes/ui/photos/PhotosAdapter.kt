package com.poli.agenciaviajes.ui.photos
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.poli.agenciaviajes.databinding.ItemPhotoBinding
import com.squareup.picasso.Picasso

class PhotosAdapter(private var photos: MutableList<Photo> = mutableListOf()) : RecyclerView.Adapter<PhotosAdapter.PhotoViewHolder>() {
    private var lastSelectedPosition: Int = -1

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoViewHolder {
        val binding = ItemPhotoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PhotoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PhotoViewHolder, position: Int) {
        holder.bind(photos[position], position)
    }

    override fun getItemCount(): Int = photos.size

    fun submitList(newPhotos: List<Photo>) {
        photos.clear()
        photos.addAll(newPhotos)
        notifyDataSetChanged()
    }

    inner class PhotoViewHolder(private val binding: ItemPhotoBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(photo: Photo, position: Int) {
            Picasso.get().load(photo.imageUrl).into(binding.imageView)
            binding.descriptionTextView.text = photo.description
            binding.descriptionTextView.visibility = if (photo.isDescriptionVisible) View.VISIBLE else View.GONE

            binding.root.setOnClickListener {
                // Toggle the visibility of the current item's description
                val currentVisibility = photo.isDescriptionVisible
                photo.isDescriptionVisible = !currentVisibility

                notifyItemChanged(position)

                // Reset the previous item's visibility
                if (lastSelectedPosition != -1 && lastSelectedPosition != position) {
                    photos[lastSelectedPosition].isDescriptionVisible = false
                    notifyItemChanged(lastSelectedPosition)
                }

                lastSelectedPosition = position
            }
        }
    }
}
