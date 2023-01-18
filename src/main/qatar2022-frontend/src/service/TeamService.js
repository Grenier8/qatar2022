import axios from "axios"

const URL = "http://localhost:8088/api/v1/teams"

class TeamService {
  getTeams() {
    return axios.get(URL)
  }
}
