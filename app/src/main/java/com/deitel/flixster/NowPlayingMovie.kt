package com.deitel.flixster

import com.google.gson.annotations.SerializedName

/**
 * The Model for storing a single book from the NY Times API
 *
 * SerializedName tags MUST match the JSON response for the
 * object to correctly parse with the gson library.
 */
class NowPlayingMovie {
    @JvmField
    @SerializedName("results")
    var tvShows: String? = null

    @JvmField
    @SerializedName("name")
    var name: String? = null

    @JvmField
    @SerializedName("poster_path")
    var tvImageUrl: String = null.toString()
}