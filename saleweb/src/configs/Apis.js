import axios from "axios";
import cookie from 'react-cookies'

const BASE_URL = 'http://localhost:8080/SaleApp/api/';

export const endpoints = {
    'categories': '/categories',
    'products': '/products',
    'register': '/users',
    'login': '/login',
    'profile': '/secure/profile',
    'pay': '/secure/cart'
}

export const authApis = () => axios.create({
    baseURL: BASE_URL,
    headers: {
        'Authorization': `Bearer ${cookie.load('token')}`
    }
})

export default axios.create({
    baseURL: BASE_URL
})