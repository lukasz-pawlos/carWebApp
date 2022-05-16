import axios from 'axios'

class AdvertService{
    create(advert){
        console.log(advert);
        return axios.post('http://localhost:8080/api/adverts',{
            color: advert.color,
            vintage: advert.vintage,
            mileage: advert.mileage,
            power: advert.power,
            fuel: advert.fuel,
            modelName: advert.modelName,
            description: advert.description,
            title: advert.title,
            price: advert.price,
            email: advert.email,
            phone: advert.phone,
        })
            .then(response => {
                return response.data;
            })
    }

    buy(data){
        return axios.post('http://localhost:8080/api/adverts/' + data.secretKey, {
            secretKey: data.secretKey,
            buyerEmail: data.buyerEmail,
            buyerPhone: data.buyerPhone,
        })
            .then(response => {
                return response.data;
            })
    }

    edit(data){
        return axios.put('http://localhost:8080/api/adverts' + data.secretKey,{
            color: data.color,
            vintage: data.vintage,
            mileage: data.mileage,
            power: data.power,
            fuel: data.fuel,
            modelName: data.modelName,
            description: data.description,
            title: data.title,
            price: data.price,
            email: data.email,
            phone: data.phone,
        })
            .then(response => {
                return response.data;
            })
    }

    delete(data){
        return axios.delete('http://localhost:8080/api/adverts/' + data.secretKey)
    }
}
export default new AdvertService();