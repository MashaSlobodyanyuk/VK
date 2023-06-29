abstract  class Attachment {
    var type :String = ""
}

class VideoAttachment (type :String = "video"): Attachment(){
    var video :Video = Video()
}

class Video (id: Int = 0,ownerId:Int =0, title: String="Super Video", description:String="Super Video"){
}

class AudioAttachment(type :String = "audio"): Attachment(){
    var audio :Audio = Audio()
}

class Audio(id:Int = 1, ownerId: Int = 1,artist: String = "Pink", title:String = "Hi", duration:Int = 300 )