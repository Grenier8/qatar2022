import React, { useState, useEffect } from "react"
import TeamService from "../../service/TeamService"
import { ChangeGroupButton } from "../ChangeGroupButton"
import { GroupChangeBar } from "../GroupChangeBar"
import { GroupTable } from "../GroupTable"
import Header from "../Header"
import { Matches } from "../Matches"

const GroupStagePage = () => {
  const [group, setGroup] = useState("A")
  const [color, setColor] = useState("purple")

  const changeGroup = (groupName, groupColor) => {
    setGroup(groupName)
    setColor(groupColor)
  }

  return (
    <div className='container p-0'>
      <Header />
      <GroupChangeBar changeGroupFunction={changeGroup} />
      <div className='text-center' style={{ backgroundColor: color }}>
        <h5>GROUP {group}</h5>
      </div>
      <GroupTable group={group} />
      <div className='d-grid'>
        <button className='btn btn-dark' style={{ borderRadius: "0px" }}>
          SAVE
        </button>
      </div>
      <Matches group={group} />
      <div className='container p-0'></div>
    </div>
  )
}

export default GroupStagePage
