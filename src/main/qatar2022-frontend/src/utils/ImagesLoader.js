import Ecuador from "../images/ecuador.png"
import Qatar from "../images/qatar.png"
import Nederland from "../images/nederland.png"
import Senegal from "../images/senegal.png"

class ImagesLoader {
  getTeamImage(teamName) {
    switch (teamName) {
      case "Ecuador":
        return Ecuador
      case "Qatar":
        return Qatar
      case "Nederland":
        return Nederland
      case "Senegal":
        return Senegal
      default:
        return null
    }
  }
}

export default new ImagesLoader()
