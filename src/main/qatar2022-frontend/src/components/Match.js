import React from "react"
import ImagesLoader from "../utils/ImagesLoader"

const Match = ({ match }) => {
  return (
    <div className='container p-0'>
      <div className='container text-center text-bg-dark p-1'>
        <div
          className='row align-items-center text-muted p-1'
          style={{ backgroundColor: "#3e3e3e" }}
        >
          <div className='col'></div>
          <div className='col'>
            <img
              src={ImagesLoader.getTeamImage(match.homeTeam.name)}
              alt={match.homeTeam.name}
              width={40}
            ></img>
          </div>
          <div className='col'>
            <h6 style={{ paddingTop: "4px" }}>{match.homeTeam.smallName}</h6>
          </div>
          <div className='col'>
            <input
              className='form-control border-0 border-bottom text-white text-center'
              style={{ backgroundColor: "#3e3e3e" }}
              type={"text"}
            ></input>
          </div>
          <div className='col'>
            <input
              className='form-control border-0 border-bottom text-white text-center'
              style={{ backgroundColor: "#3e3e3e" }}
              type={"text"}
            ></input>
          </div>
          <div className='col'>
            <h6 style={{ paddingTop: "4px" }}>{match.awayTeam.smallName}</h6>
          </div>
          <div className='col'>
            <img
              src={ImagesLoader.getTeamImage(match.awayTeam.name)}
              alt={match.awayTeam.name}
              width={40}
            ></img>
          </div>
          <div className='col'></div>
        </div>
      </div>
      <div
        className='container p-1 text-center'
        style={{ backgroundColor: "#252525", color: "#464646" }}
      >
        <h6 className='m-0'>{match.stadium}</h6>
      </div>
      <div
        className='container p-1 text-center'
        style={{ backgroundColor: "#464646", color: "#606060" }}
      >
        <h6 className='m-0'>{match.date}</h6>
      </div>
    </div>
  )
}

export default Match
