import React from "react"
import ImagesLoader from "../utils/ImagesLoader"

const Match = ({ match }) => {
  const saveHomeGoals = (goals) => {
    match.homeMatchStats.goals = goals
    match.ended = true
  }
  const saveAwayGoals = (goals) => {
    match.awayMatchStats.goals = goals
    match.ended = true
  }

  return (
    <div className='container p-0'>
      <div className='container text-center text-bg-dark p-0'>
        <div
          className='row justify-content-center align-items-center text-muted p-1 m-0'
          style={{ backgroundColor: "#3e3e3e" }}
        >
          <div className='col-1'>
            <img
              src={ImagesLoader.getTeamImage(match.homeTeam.name)}
              alt={match.homeTeam.name}
              width={40}
            ></img>
          </div>
          <div className='col-2'>
            <h6 style={{ paddingTop: "4px" }}>{match.homeTeam.smallName}</h6>
          </div>
          <div className='col-1'>
            <input
              onChange={(e) => saveHomeGoals(e.target.value)}
              className='form-control border-0 border-bottom text-white text-center'
              style={{ backgroundColor: "#3e3e3e" }}
              type={"text"}
              value={match.ended ? match.homeMatchStats.goals : ""}
            ></input>
          </div>
          <div className='col-1'>
            <input
              onChange={(e) => saveAwayGoals(e.target.value)}
              className='form-control border-0 border-bottom text-white text-center'
              style={{ backgroundColor: "#3e3e3e" }}
              type={"text"}
              value={match.ended ? match.awayMatchStats.goals : ""}
            ></input>
          </div>
          <div className='col-2'>
            <h6 style={{ paddingTop: "4px" }}>{match.awayTeam.smallName}</h6>
          </div>
          <div className='col-1'>
            <img
              src={ImagesLoader.getTeamImage(match.awayTeam.name)}
              alt={match.awayTeam.name}
              width={40}
            ></img>
          </div>
        </div>
      </div>
      <div
        className='text-center'
        style={{ backgroundColor: "#252525", color: "#464646" }}
      >
        <h6 className='m-0'>{match.stadium}</h6>
      </div>
      <div
        className='text-center'
        style={{ backgroundColor: "#464646", color: "#606060" }}
      >
        <h6 className='m-0'>{match.date}</h6>
      </div>
    </div>
  )
}

export default Match
