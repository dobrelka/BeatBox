package com.dobrelka.beatbox

import android.content.res.AssetManager
import java.lang.Exception
import android.util.Log

private const val TAG = "BeatBox"
private const val SOUNDS_FOLDER = "sample_sounds"

// Stashing an AssetManager for safekeeping
class BeatBox(private val assets: AssetManager) {

    // Listing of what you have in your assets, you can  use the list(String) function.
    //Function called loadSounds()  looks in your assets with list(String)
    fun loadSounds(): List<String> {
        try {
            val soundNames = assets.list(SOUNDS_FOLDER)!!
            Log.d(TAG, "Found ${soundNames.size} sounds")
            return soundNames.asList()
        } catch (e: Exception) {
            Log.e(TAG, "Could not list assets", e)
            return emptyList()
        }
    }
}