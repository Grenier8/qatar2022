import Header from "./components/Header"
import StartMenuBox from "./components/StartMenuBox"
import Lusailpic from "./images/lusail.jpeg"
import DukiPic from "./images/duki.jpeg"

function App() {
  return (
    <div className='container'>
      <Header />
      <StartMenuBox image={Lusailpic} title='Group Stage' />
      <StartMenuBox image={DukiPic} title='Calendar' />
    </div>
  )
}

export default App
