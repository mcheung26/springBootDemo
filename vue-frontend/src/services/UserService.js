import axios from 'axios';

const USER_API_BASE_URL = 'http://localhost:8080/demo/getAll';

class UserService {
    getUsers() {
        return axios.get(USER_API_BASE_URL);
    }
}

export default new UserService();