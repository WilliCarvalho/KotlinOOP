class MedicalRobot (val weight: Double, val canSpeak: Boolean): Robot{
    override fun on(){
        println("Robot On")
    }

    override fun off() {
        println("Robot off");
    }

    fun speak(){
        if(canSpeak){
            println("I'M ALIVE!!!")
        } else {
            println("Speak is not enable to this robot")
        }
    }
}