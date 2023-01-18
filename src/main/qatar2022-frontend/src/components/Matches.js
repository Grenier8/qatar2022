import React, { useState, useEffect } from "react"
import MatchService from "../service/MatchService"
import Match from "./Match"

export const Matches = () => {
  const [matches, setMatches] = useState([])

  useEffect(() => {
    getMatches()
  }, [])

  const getMatches = () => {
    MatchService.getMatches().then((res) => setMatches(res.data))
  }

  return (
    <div>
      {matches.map((match) => (
        <Match match={match} />
      ))}
    </div>
  )
}
