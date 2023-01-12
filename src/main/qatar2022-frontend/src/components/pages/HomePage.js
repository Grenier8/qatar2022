import React from "react"
import Header from "../Header"
import StartMenuBox from "../StartMenuBox"
import Lusailpic from "../../images/lusail.jpeg"
import MessiNey from "../../images/MessiNey.jpeg"
import Donatello from "../../images/donatello.jpeg"
import Russia from "../../images/rusia.jpeg"
import Cr7 from "../../images/cr7.jpeg"

const HomePage = () => {
  return (
    <div>
      <Header />
      <StartMenuBox image={Lusailpic} title='Group Stage' />
      <StartMenuBox image={MessiNey} title='Knockout Stage' />
      <StartMenuBox image={Donatello} title='Calendar' />
      <StartMenuBox image={Russia} title='History' />
      <StartMenuBox image={Cr7} title='Statitics' />
    </div>
  )
}

export default HomePage
