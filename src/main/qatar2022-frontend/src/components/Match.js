import React from "react"

const Match = ({ team1, team2, date, stadium }) => {
  return (
    <div className='vertical-container'>
      <div className='vertical-container match-results'>
        <img src={team1} alt='Team1'></img>
        <h4>Team1</h4>
        <input className='input-score' type={"text"}></input>
        <input className='input-score' type={"text"}></input>
        <h4>Team2</h4>
        <img src={team2} alt='Team2'></img>
      </div>
    </div>
  )
}

export default Match
