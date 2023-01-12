import React from "react"
import Header from "../Header"
import Match from "../Match"

const GroupStagePage = ({ group, color }) => {
  return (
    <div className='main-container'>
      <Header />
      <div className='header-group-table' style={{ "background-color": color }}>
        <h5>GROUP {group}</h5>
      </div>
      <table></table>
      <button className='save-button'>SAVE</button>
      <Match />
      <div className='vertical-container'></div>
    </div>
  )
}

export default GroupStagePage
