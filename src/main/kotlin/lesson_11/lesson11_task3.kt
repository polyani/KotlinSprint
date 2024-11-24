package lesson_11

class Room(
    val roomId: Int,
    val roomName: String,
    val roomCover: String,
    val users: MutableMap<Participant, ParticipantStatus>
) {
    fun addUser(participant: Participant) {
        users.putIfAbsent(participant, ParticipantStatus.TALKING)
        println("Добавить участика в комнату")
    }

    fun updateStatus(participantName: String, newStatus: ParticipantStatus){
        users.filter { it.key.participantName == participantName }.forEach { users[it.key] = newStatus }
        println("Изменение статуса участника")
    }
}

class Participant(
    val participantId: Int,
    val participantName: String,
    val participantAvatar: String,

) {
    // методы для класса Participant
}

fun main() {

    val participant1 = Participant(
        participantId = 1,
        participantName = "Ivan",
        participantAvatar = "rty",

    )
    val participant2 = Participant(
        participantId = 2,
        participantName = "Fedya",
        participantAvatar = "hjkj",

    )
    val participant3 = Participant(
        participantId = 3,
        participantName = "Rima",
        participantAvatar = "uyi",

    )
    val participant4 = Participant(
        participantId = 4,
        participantName = "Iuda",
        participantAvatar = "not",

    )

    val room1 = Room(
        roomId = 1,
        roomName = "First",
        roomCover = "Tcnm",
        users = mutableMapOf()
        )

    println()
    room1.addUser(participant1)
    println()
    room1.addUser(participant4)
    println()
    room1.updateStatus("Iuda", ParticipantStatus.MICROPHONE_OFF)


}

enum class ParticipantStatus(val code: String, val description: String) {
    TALKING("talking", "разговаривает"),
    MICROPHONE_OFF("microphone off", "микрофон выключен"),
    USER_MUTED("user is muted", "пользователь заглушен")
}
