import React, { useState, useEffect } from "react"
import Header from "../Header"
import Match from "../Match"

const GroupStagePage = ({ url, teams, group, color }) => {
  const [matches, setMatches] = useState([])

  useEffect(() => {
    getMatches()
  }, [])

  const getMatches = () => {
    return fetch(url + "/matches/")
      .then((response) => response.json())
      .then((data) => setMatches(data))
  }

  return (
    <div className='main-container'>
      <Header />
      <div className='header-group-table' style={{ "background-color": color }}>
        <h5>GROUP {group}</h5>
      </div>
      <table></table>
      <button className='save-button'>SAVE</button>
      <Match match={matches[0]} />
      <div className='vertical-container'></div>
    </div>
  )
}

export default GroupStagePage
