import axios from "axios"

const URL = "http://localhost:8088/api/v1/matches/"

class MatchService {
  getMatches() {
    return axios.get(URL)
  }

  getMatchesByGroup(group) {
    return axios.get(URL + `group/${group}/`)
  }
}

export default new MatchService()
