class Player():
    def __init__(self,name,jm,tk):
        self.name=name
        self.jm=jm
        self.tk=tk
    def introduce(self):
        print("{}은 {}선수이며,특기는{}입니다.".format(self.name,self.jm,self.tk))
    def changespecial(self,sp):
        self.tk=sp    
fbp=Player("손흥민","축구","킥")
bbp=Player("김현수","야구","타격")

fbp.introduce()
bbp.introduce()

fbp.changespecial("슛")
fbp.introduce()