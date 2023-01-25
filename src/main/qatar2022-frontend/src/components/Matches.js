import React, { useState, useEffect } from "react"
import MatchService from "../service/MatchService"
import Match from "./Match"

export const Matches = ({ matches, group }) => {
  return (
    <div>
      {matches.map((match) =>
        match.phase === 1 && match.homeTeam.group === group ? (
          <Match key={match.id} match={match} />
        ) : null
      )}
    </div>
  )
}
