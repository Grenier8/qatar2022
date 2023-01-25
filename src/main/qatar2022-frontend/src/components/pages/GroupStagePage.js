import React, { useState, useEffect } from "react"
import MatchService from "../../service/MatchService"
import TeamService from "../../service/TeamService"
import { ChangeGroupButton } from "../ChangeGroupButton"
import { GroupChangeBar } from "../GroupChangeBar"
import { GroupTable } from "../GroupTable"
import Header from "../Header"
import { Matches } from "../Matches"

const GroupStagePage = () => {
  const [matches, setMatches] = useState([])
  const [teams, setTeams] = useState([])
  const [group, setGroup] = useState("A")
  const [color, setColor] = useState("purple")

  useEffect(() => {
    getMatches()
    getTeams()
  }, [group])

  const getMatches = () => {
    MatchService.getMatches().then((res) => setMatches(res.data))
  }

  const getTeams = () => {
    TeamService.getTeamsByGroup(group).then((res) => setTeams(res.data))
  }

  const changeGroup = (groupName, groupColor) => {
    setGroup(groupName)
    setColor(groupColor)
  }

  const saveChanges = () => {
    MatchService.saveMatches(matches)
    getMatches()
    getTeams()
  }

  return (
    <div className='container p-0'>
      <Header />
      <GroupChangeBar changeGroupFunction={changeGroup} />
      <div className='text-center' style={{ backgroundColor: color }}>
        <h5 className='m-0'>GROUP {group}</h5>
      </div>
      <GroupTable teams={teams} group={group} />
      <div className='d-grid'>
        <button
          onClick={saveChanges}
          className='btn btn-dark'
          style={{ borderRadius: "0px" }}
        >
          SAVE
        </button>
      </div>
      <Matches matches={matches} group={group} />
      <div className='container p-0'></div>
    </div>
  )
}

export default GroupStagePage
