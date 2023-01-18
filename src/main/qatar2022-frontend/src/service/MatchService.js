import axios from "axios"

const URL = "http://localhost:8088/api/v1/matches/"

class MatchService {
  getMatches() {
    return axios.get(URL)
  }
}

export default new MatchService()
