import React, { useState, useEffect } from "react"
import MatchService from "../../service/MatchService"
import Header from "../Header"
import Match from "../Match"
import { Matches } from "../Matches"

const GroupStagePage = ({ teams, group, color }) => {
  return (
    <div className='container p-0'>
      <Header />
      <div className='text-center' style={{ backgroundColor: color }}>
        <h5>GROUP {group}</h5>
      </div>
      <table></table>
      <div className='d-grid'>
        <button className='btn btn-dark' style={{ borderRadius: "0px" }}>
          SAVE
        </button>
      </div>
      <Matches />
      <div className='container p-0'></div>
    </div>
  )
}

export default GroupStagePage
