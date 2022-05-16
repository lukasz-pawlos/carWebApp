import AdvertService from   '../services/advert-service'


export const advert = {
    namespaced: true,
    actions: {
        create(advert) {
            console.log(advert);
            return AdvertService.create(advert).then(
                response => {
                    return Promise.resolve(response)
                },
                error => {
                    return Promise.reject(error);
                }
            )
        },

        buy(data) {
            return AdvertService.buy(data).then(
                response => {
                    return Promise.resolve(response.data)
                },
                error => {
                    return Promise.reject(error.response.data);
                }
            )
        },

        edit(data) {
            return AdvertService.edit(data).then(
                response => {
                    return Promise.resolve(response.data)
                },
                error => {
                    return Promise.reject(error.response.data);
                }
            )
        },

        delete(data) {
            return AdvertService.delete(data).then(
                response => {
                    return Promise.resolve(response.data)
                },
                error => {
                    return Promise.reject(error.response.data);
                }
            )
        },

    },


}