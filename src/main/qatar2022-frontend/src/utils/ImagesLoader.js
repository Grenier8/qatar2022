import Ecuador from "../images/countries/ecuador.png"
import Qatar from "../images/countries/qatar.png"
import Nederland from "../images/countries/nederland.png"
import Senegal from "../images/countries/senegal.png"
import England from "../images/countries/england.png"
import Iran from "../images/countries/iran.png"
import Usa from "../images/countries/usa.png"
import Wales from "../images/countries/wales.png"

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
      case "England":
        return England
      case "Iran":
        return Iran
      case "United States":
        return Usa
      case "Wales":
        return Wales
      default:
        return null
    }
  }
}

export default new ImagesLoader()
