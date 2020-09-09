package com.dobrelka.beatbox

private const val WAV = ".wav"

class Sound(val assetPath: String) {

    // Split off the filename using String.split(String).last()
    // and use String.removeSuffix(String) to strip off the file extension.
    val name = assetPath.split("/").last().removeSuffix(WAV)
}