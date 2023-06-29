abstract  class Attachment {
    var type :String = ""
}

class VideoAttachment (type :String = "video"): Attachment(){
    var video :Video = Video()
}

class Video (){
}