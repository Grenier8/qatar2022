import React from "react"

const Match = ({ match }) => {
  return (
    <div className='vertical-container'>
      <div className='vertical-container match-results'>
        <img src={match.homeTeam} alt='Team1'></img>
        <h4>{match.homeTeam.smallName}</h4>
        <input className='input-score' type={"text"}></input>
        <input className='input-score' type={"text"}></input>
        <h4>{match.awayTeam.smallName}</h4>
        <img src={match.awayTeam} alt='Team2'></img>
      </div>
      <div className='vertical-container'>
        <h5></h5>
      </div>
    </div>
  )
}

export default Match
