abstract class Attachment {
    open var type: String = ""
}

class VideoAttachment(override var type: String = "video") : Attachment() {
    var video: Video = Video()
}

class Video(id: Int = 0, ownerId: Int = 0, title: String = "Super Video", description: String = "Super Video") {
}

class AudioAttachment(override var type: String = "audio") : Attachment() {
    var audio: Audio = Audio()
}

class Audio(id: Int = 1, ownerId: Int = 1, artist: String = "Pink", title: String = "Hi", duration: Int = 300)

class FileAttachment(override var type: String = "file") : Attachment() {
    var file: File = File()
}

class File(id: Int = 1, ownerId: Int = 1, title: String = "file", size: Int = 1, ext: String = "xls")

class PhotoAttachment(override var type: String = "photo") : Attachment() {
    var photo: Photo = Photo()
}

class Photo(id: Int = 1, albumId: Int = 1, ownerId: Int = 1, userId: Int = 1, text: String = "photo")

class GiftAttachment(override var type: String = "gift") : Attachment() {
    var gift: Gift = Gift()
}

class Gift(id: Int = 1, thumb256: String = "256x256px", thumb96: String = "96x96px", thumb48: String = "48x48px")

