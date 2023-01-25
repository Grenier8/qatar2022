import React, { useEffect, useState } from "react"
import TeamService from "../service/TeamService"

export const GroupTable = ({ teams, group }) => {
  return (
    <div className='bg-dark'>
      <table className='table table-dark table-striped m-0'>
        <thead>
          <tr>
            <th scope='col'>Team</th>
            <th scope='col'>Pts.</th>
            <th scope='col'>GF</th>
            <th scope='col'>GA</th>
          </tr>
        </thead>
        <tbody>
          {teams.map((team) => (
            <tr key={team.id}>
              <td>{team.name}</td>
              <td>{team.points}</td>
              <td>{team.goalsFor}</td>
              <td>{team.goalsAgainst}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  )
}
