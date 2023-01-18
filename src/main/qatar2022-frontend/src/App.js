import React, { useState, useEffect } from "react"
import GroupStagePage from "./components/pages/GroupStagePage"
// import HomePage from "./components/pages/HomePage"

function App() {
  const url = "http://localhost:8088/api/v1"
  const [teams, setTeams] = useState([])

  useEffect(() => {
    fetchTeams()
  }, [])

  const fetchTeams = () => {
    return fetch(url + "/teams/")
      .then((response) => response.json())
      .then((data) => setTeams(data))
  }

  return (
    <div className='container p-0'>
      {/* <HomePage /> */}
      <GroupStagePage group={"A"} color={"purple"} />
    </div>
  )
}

export default App
